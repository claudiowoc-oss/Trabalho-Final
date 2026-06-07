package com.exemplo.taskapp.data.repository

import com.exemplo.taskapp.data.local.TaskDao
import com.exemplo.taskapp.data.local.TaskEntity
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {
    val allTasks: Flow<List<TaskEntity>> = taskDao.getAllTasks()

    suspend fun insert(task: TaskEntity) {
        taskDao.insertTask(task)
    }
}
