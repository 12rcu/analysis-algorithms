package com.github.12rcu.analysisalgorithms.services

import com.intellij.openapi.project.Project
import com.github.12rcu.analysisalgorithms.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
