package br.com.bueno.grandesmestresmarciais.adapters.out

import br.com.bueno.grandesmestresmarciais.adapters.out.repository.ModalityRepository
import br.com.bueno.grandesmestresmarciais.core.domain.Modality
import br.com.bueno.grandesmestresmarciais.core.ports.out.FindAllModalityOutputPort
import org.springframework.stereotype.Component

@Component
class FindAllModalityAdapter(
    private val modalityRepository: ModalityRepository
): FindAllModalityOutputPort {
    override fun findAll(): List<Modality> {
        val modality = modalityRepository.findAll().map {
            it.toDomain()
        }
        return modality
    }

}