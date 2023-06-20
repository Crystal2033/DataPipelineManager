package ru.mai.lessons.rpks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Enrichment Already exist")
public class EnrichmentAlreadyExistException extends Exception {
}
