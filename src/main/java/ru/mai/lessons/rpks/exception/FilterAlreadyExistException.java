package ru.mai.lessons.rpks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Filter Already exist")
public class FilterAlreadyExistException extends Exception {
}
