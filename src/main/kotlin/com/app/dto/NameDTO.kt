package com.app.dto

import com.app.model.Status
import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.media.Schema
import java.util.*

@Introspected
@Schema(name = "Name")
data class NameDTO(
    @field:Schema(
        title = "id",
        description = "The id of the name, format UUID",
        example = "3fa85f64-5717-4562-b3fc-2c963f66afa6",
    )
    val id: UUID,

    @field:Schema(
        title = "value",
        description = "The value of the name",
        example = "Galego",
    )
    val value: String,

    @field:Schema(
        title = "status",
        description = "The status of the name",
        example = "active",
        allowableValues = [
            "active",
            "inactive",
            "blocked"
        ]
    )
    val status: Status,
)


