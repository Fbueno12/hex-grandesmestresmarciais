package br.com.bueno.grandesmestresmarciais.adapters.out

import br.com.bueno.grandesmestresmarciais.adapters.out.entity.ModalityEntity
import br.com.bueno.grandesmestresmarciais.adapters.out.repository.ModalityRepository
import br.com.bueno.grandesmestresmarciais.core.domain.Modality
import br.com.bueno.grandesmestresmarciais.core.ports.out.InsertModalityOutputPort
import org.springframework.stereotype.Component

@Component
class InsertModalityAdapter(
    private val modalityRepository: ModalityRepository
): InsertModalityOutputPort {
    override fun insert(modality: Modality) {
        modalityRepository.save(ModalityEntity().fromDomain(modality))
    }
}