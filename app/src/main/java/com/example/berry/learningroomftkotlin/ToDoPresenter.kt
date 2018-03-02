package com.example.berry.learningroomftkotlin

import javax.inject.Inject

/**
 * Created by per6 on Mar 02, 2018 at 13:55
 */
class ToDoPresenter @Inject constructor(val taskDao: TaskDao) {
    var tasks = ArrayList<Task>()
    //TODO: implement MVP style interactions
}