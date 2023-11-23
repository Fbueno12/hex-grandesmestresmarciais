package br.com.bueno.grandesmestresmarciais.adapters.`in`.dto

import br.com.bueno.grandesmestresmarciais.core.domain.Modality

data class ModalityDTO (
    var id: Int? = 0,
    var name: String? = null,
    var description: String? = null
) {
    fun toDomain(): Modality {
        val dto = this
        return Modality(dto.id, dto.name, dto.description)
    }
    fun fromDomain(domain: Modality): ModalityDTO {
        return this.apply {
            id = domain.id
            name = domain.name
            description = domain.description
        }
    }
}