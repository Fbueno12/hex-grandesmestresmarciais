package br.com.bueno.grandesmestresmarciais.adapters.out

import br.com.bueno.grandesmestresmarciais.adapters.out.repository.ModalityRepository
import br.com.bueno.grandesmestresmarciais.core.domain.Modality
import br.com.bueno.grandesmestresmarciais.core.ports.out.FindModalityByIdOutputPort
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class FindModalityByidAdapter(
    private val modalityRepository: ModalityRepository
): FindModalityByIdOutputPort {
    override fun find(modalityId: Int): Modality {
        val result = modalityRepository.findByIdOrNull(modalityId)
            ?: throw RuntimeException("Couldn't find modality'")
        return result.toDomain()
    }
}