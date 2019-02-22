package com.community.batch.jobs.inactive.listener;

//import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.stereotype.Component;

//@Slf4j
@Component
public class InactiveChunkListener implements ChunkListener {

	private final Logger log=LoggerFactory.getLogger(this.getClass());
			//new InactiveChunkListener();
    @Override
    public void beforeChunk(ChunkContext context) {
        log.info("Before Chunk");
    }

    @Override
    public void afterChunk(ChunkContext context) {
        log.info("After Chunk");
    }

    @Override
    public void afterChunkError(ChunkContext context) {
        log.info("After Chunk Error");
    }
}
