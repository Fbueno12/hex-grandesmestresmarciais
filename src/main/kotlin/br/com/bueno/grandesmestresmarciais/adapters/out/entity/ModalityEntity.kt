package br.com.bueno.grandesmestresmarciais.adapters.out.entity

import br.com.bueno.grandesmestresmarciais.core.domain.Modality
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ModalityEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Int? = 0,
    var name: String? = null,
    var description: String? = null,
) {
    fun fromDomain(modality: Modality): ModalityEntity {
        return this.apply {
            this.name = modality.name
            this.description = modality.description
        }
    }
    fun toDomain(): Modality {
        val entity = this
        return Modality(
            id = entity.id,
            name = entity.name,
            description = entity.description
        )
    }
}
