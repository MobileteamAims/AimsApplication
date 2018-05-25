package com.project.iitu.todolist.data;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.project.iitu.todolist.entities.Category;
import com.project.iitu.todolist.entities.Task;
import com.project.iitu.todolist.entities.User;

import java.util.ArrayList;

public interface IDataSource {
    User getCurrentUser();
    ArrayList<User> getUserList();
    ArrayList<Task> getTaskList();
    ArrayList<Category> getCategoryList();
    boolean setCurrentUser(@NonNull User user);
    boolean createTask(@NonNull Task task);
    boolean createCategory(@NonNull Category category);
    boolean addUser(@NonNull User user);
    boolean updateTask(@NonNull Task task, @IntRange(from = 0, to = Integer.MAX_VALUE) int index);
    boolean updateTask(@NonNull Task task);
    @Nullable
    Category getCategoryById(long id);
    boolean isNameFreeForCategory(String name);
}
