package demo

import grails.artefact.Enhances

@Enhances('Service')
trait SomeTrait {
    int getTheAnswer() {
        42
    }
}
