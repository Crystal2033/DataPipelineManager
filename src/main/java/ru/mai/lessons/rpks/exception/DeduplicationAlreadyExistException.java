package ru.mai.lessons.rpks.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Deduplication Already exist")
public class DeduplicationAlreadyExistException extends Exception {
}
