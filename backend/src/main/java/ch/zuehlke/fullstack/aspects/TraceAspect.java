package ch.zuehlke.fullstack.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TraceAspect {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* ch.zuehlke.fullstack.api.ExampleController.getExample())")
    public void demo() {
        logger.info("Demo log");
    }

}
