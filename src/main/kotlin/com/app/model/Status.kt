package com.app.model

import com.fasterxml.jackson.annotation.JsonProperty

enum class Status(
    val value: String
) {
    @JsonProperty("active")
    ACTIVE("active"),

    @JsonProperty("inactive")
    INACTIVE("inactive"),

    @JsonProperty("blocked")
    BLOCKED("blocked");

    companion object {
        fun valuesAsString(): Array<String> {
            return Status.values().map { it.value }.toTypedArray()
        }
    }
}