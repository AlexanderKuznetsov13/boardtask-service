package ru.alex.kuznetsov.project.simbirsoft.util;

import ru.alex.kuznetsov.project.simbirsoft.dto.*;
import ru.alex.kuznetsov.project.simbirsoft.entity.ProjectEntity;
import ru.alex.kuznetsov.project.simbirsoft.entity.ReleaseEntity;
import ru.alex.kuznetsov.project.simbirsoft.entity.TaskStatusEntity;
import ru.alex.kuznetsov.project.simbirsoft.entity.UsersTypeEntity;

public class CommonMapper {

    public static ReleaseEntity fromReleaseRequestDtoToReleaseEntity(ReleaseRequestDto requestDto) {
        ReleaseEntity release = new ReleaseEntity();
        release.setId(requestDto.getId());
        release.setCompleteWorkTime(requestDto.getCompleteWorkTime());
        release.setStartWorkTime(requestDto.getStartWorkTime());
        return release;
    }

    public ReleaseResponseDto fromReleaseEntityToReleaseResponseDto(ReleaseEntity release) {
        ReleaseResponseDto responseDto = new ReleaseResponseDto();
        responseDto.setId(release.getId());
        responseDto.setStartWorkTime(release.getStartWorkTime());
        responseDto.setCompleteWorkTime(release.getCompleteWorkTime());
        responseDto.setProjectId(release.getProjectRelease().getId());
        return responseDto;
    }

    public static ProjectEntity fromProjectRequestDtoToProjectEntity(ProjectRequestDto requestDto) {
        ProjectEntity project = new ProjectEntity();
        project.setId(requestDto.getId());
        project.setName(requestDto.getName());
        project.setDescription(requestDto.getDescription());
        return project;
    }

    public ProjectResponseDto fromProjectEntityToProjectResponseDto(ProjectEntity project) {
        ProjectResponseDto responseDto = new ProjectResponseDto();
        responseDto.setId(project.getId());
        responseDto.setName(project.getName());
        responseDto.setDescription(project.getDescription());
        return responseDto;
    }

    public static TaskStatusEntity fromTaskStasusRequestDtoToTaskStatusEntity(TaskStatusRequestDto requestDto) {
        TaskStatusEntity taskStatus = new TaskStatusEntity();
        taskStatus.setId(requestDto.getId());
        taskStatus.setName(requestDto.getName());
        return taskStatus;
    }

    public TaskStatusResponseDto fromTaskStatusEntityToTaskStatusResponseDto(TaskStatusEntity taskStatus) {
        TaskStatusResponseDto responseDto = new TaskStatusResponseDto();
        responseDto.setId(taskStatus.getId());
        responseDto.setName(taskStatus.getName());
        return responseDto;
    }

    public static UsersTypeEntity fromUserTypeRequestDtoToUsersTypeEntity(UserTypeRequestDto requestDto) {
        UsersTypeEntity usersType = new UsersTypeEntity();
        usersType.setId(requestDto.getId());
        usersType.setName(requestDto.getName());
        usersType.setDescription(requestDto.getDescription());
        return usersType;
    }

    public UserTypeResponseDto fromUsersTypeEntityToUserTypeResponseDto(UsersTypeEntity usersType) {
        UserTypeResponseDto responseDto = new UserTypeResponseDto();
        responseDto.setId(usersType.getId());
        responseDto.setName(usersType.getName());
        responseDto.setDescription(usersType.getDescription());
        return responseDto;
    }
//    public static ProjectEntity fromProjectRequestDtoToProjectEntity(ProjectRequestDto requestDto) {
//        ProjectEntity project = new ProjectEntity();
//        return project;
//    }
//
//    public ProjectResponseDto fromProjectEntityToProjectResponseDto(ProjectEntity release) {
//        ProjectResponseDto responseDto = new ProjectResponseDto();
//        return responseDto;
//    }


}

