package locking_application.locking.Project.exception;

import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(OptimisticLockingFailureException.class)
    public String handleOptimisticLockException(OptimisticLockingFailureException ex) {
        return "Conflict detected! Please retry the operation.";
    }
}