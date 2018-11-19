package test.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LanguageDefinitionException extends Exception {
    public LanguageDefinitionException(){
        log.error("Language is not defined");
    }
}
