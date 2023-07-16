package com.app.dto

import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.media.Schema

@Introspected
data class IndexRequestFilterDTO(
    @field:Schema(
        title = "value",
        description = "Searches a name by value",
        nullable = true,
        example = "Pandora",
    )
    val value: String? = null,
)
