package com.example.batch.load.writer;

import com.example.batch.load.entity.TnSkillUploadDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SkillItemWriter implements ItemWriter<TnSkillUploadDetails> {

    private static final Logger logger = LoggerFactory.getLogger(SkillItemWriter.class);

    @PersistenceContext
    private final EntityManager entityManager;

    @Autowired
    public SkillItemWriter(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void write(Chunk<? extends TnSkillUploadDetails> chunk) {
        logger.info("Writing chunk of {} items", chunk.size());

        for (TnSkillUploadDetails item : chunk) {
            try {
                TnSkillUploadDetails existing = entityManager.find(TnSkillUploadDetails.class, item.getSkillUniqueKey());
                if (existing != null) {
                    updateExistingEntity(existing, item);
                    logger.info("UPDATED skill {}", item.getSkillUniqueKey());
                } else {
                    entityManager.persist(item);
                    logger.info("INSERTED skill {}", item.getSkillUniqueKey());
                }
                entityManager.flush();
            } catch (Exception e) {
                logger.error("Failed on skill {}: {}", item.getSkillUniqueKey(), e.getMessage());
                throw e;
            }
        }

    }


    private void updateExistingEntity(TnSkillUploadDetails existing, TnSkillUploadDetails newData) {
        existing.setSkillGrouping(newData.getSkillGrouping());
        existing.setSkillGroupingUniqueKey(newData.getSkillGroupingUniqueKey());
        existing.setSkillTitle(newData.getSkillTitle());
        existing.setSkillOverview(newData.getSkillOverview());
        existing.setSkillContext(newData.getSkillContext());
        existing.setSkillElementExample1(newData.getSkillElementExample1());
        existing.setSkillPerformanceCriteria11(newData.getSkillPerformanceCriteria11());
        existing.setSkillPerformanceCriteria12(newData.getSkillPerformanceCriteria12());
        existing.setSkillElementExample2(newData.getSkillElementExample2());
        existing.setSkillPerformanceCriteria21(newData.getSkillPerformanceCriteria21());
        existing.setSkillPerformanceCriteria22(newData.getSkillPerformanceCriteria22());
        existing.setSkillElementExample3(newData.getSkillElementExample3());
        existing.setSkillPerformanceCriteria31(newData.getSkillPerformanceCriteria31());
        existing.setSkillPerformanceCriteria32(newData.getSkillPerformanceCriteria32());
        existing.setSkillElementExample4(newData.getSkillElementExample4());
        existing.setSkillPerformanceCriteria41(newData.getSkillPerformanceCriteria41());
        existing.setSkillPerformanceCriteria42(newData.getSkillPerformanceCriteria42());
        existing.setMethodForMeasuringSkill1(newData.getMethodForMeasuringSkill1());
        existing.setMethodForMeasuringSkill2(newData.getMethodForMeasuringSkill2());
        existing.setMethodForMeasuringSkill3(newData.getMethodForMeasuringSkill3());
        existing.setMethodForMeasuringSkill4(newData.getMethodForMeasuringSkill4());

    }

}