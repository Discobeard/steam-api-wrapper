package com.discobeard.steam.api.wrapper.domain

enum Team {
    Radiant("radiant"), Dire("dire")

    String name

    Team(String name) {
        this.name = name
    }
}
