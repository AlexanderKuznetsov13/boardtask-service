package ru.alex.kuznetsov.project.simbirsoft.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.alex.kuznetsov.project.simbirsoft.dto.BoardTaskRequestDto;
import ru.alex.kuznetsov.project.simbirsoft.dto.BoardTaskResponseDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Tag(name = "Управление задачами")
@RestController
@RequestMapping(value = "/task", produces = "application/json;charset=UTF-8")
public class TaskController {

    private final List<BoardTaskResponseDto> taskList = new ArrayList<>();
    private int indexList = 0;

    @Operation(summary = "Получить задачу по ID")
    @GetMapping("/{taskId}")
    @ResponseBody
    public ResponseEntity<BoardTaskResponseDto> getTaskByTaskId(@PathVariable Integer taskId) {
        BoardTaskResponseDto boardTask = null;
        for (int i = 0; i < taskList.size(); i++) {
            boardTask = taskList.get(i);
            if (boardTask.getId() == taskId) {
                return new ResponseEntity<>(boardTask, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(boardTask, HttpStatus.NOT_FOUND);
    }

    @Operation(summary = "Создать задачу")
    @PostMapping
    @ResponseBody
    public ResponseEntity<BoardTaskRequestDto> createTask(@RequestBody BoardTaskRequestDto boardTask) {
//        todo copy to service layer and use model of task for request and response DTO
//        boardTask.setId(indexList + 1);
//        taskList.add(boardTask);
//        indexList++;
        return new ResponseEntity<>(boardTask, HttpStatus.OK);
    }

    @Operation(summary = "вывести все задачи")
    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<List<BoardTaskResponseDto>> findAll() {
        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }


    @ExceptionHandler(IOException.class)
    public ResponseEntity handleIOException(IOException e) {
        return ResponseEntity.badRequest().build();
    }

}