package com.github.dekonoplyov.persistentstateinspector.services

import com.intellij.openapi.project.Project
import com.github.dekonoplyov.persistentstateinspector.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
