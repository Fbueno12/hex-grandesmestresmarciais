package br.com.bueno.grandesmestresmarciais.adapters.out

import br.com.bueno.grandesmestresmarciais.adapters.out.repository.ModalityRepository
import br.com.bueno.grandesmestresmarciais.core.ports.out.DeleteModalityOutputPort
import org.springframework.stereotype.Component

@Component
class DeleteModalityAdapter(
    private val modalityRepository: ModalityRepository
): DeleteModalityOutputPort {
    override fun delete(modalityId: Int) {
        modalityRepository.deleteById(modalityId)
    }
}