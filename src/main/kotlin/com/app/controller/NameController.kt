package com.app.controller

import com.app.common.dto.PageDTO
import com.app.dto.IndexRequestFilterDTO
import com.app.dto.NameDTO
import com.app.model.Status
import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.apache.commons.lang3.RandomStringUtils
import java.util.*

@Tag(name = "Names")
@Controller("/names")
class NameController {

    @Get(uri = "/{?filters*}", produces = [APPLICATION_JSON])
    @Operation(description = "List names with the possibility of searching.")
    fun index(filters: IndexRequestFilterDTO): PageDTO<NameDTO> {
        return PageDTO(
            data = (0..10).map { createName() }
        )
    }

    private fun createName() = NameDTO(
        id = UUID.randomUUID(),
        value = RandomStringUtils.randomAlphanumeric(10),
        status = Status.ACTIVE
    )
}
