package com.project.iitu.todolist.adapters;


public interface ISwipeItemAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
