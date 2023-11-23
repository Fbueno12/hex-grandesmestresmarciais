package br.com.bueno.grandesmestresmarciais.core.usecase

import br.com.bueno.grandesmestresmarciais.core.domain.Modality
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.DeleteModalityInputPort
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.FindAllModalityInputPort
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.FindModalityByIdInputPort
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.InsertModalityInputPort
import br.com.bueno.grandesmestresmarciais.core.ports.out.DeleteModalityOutputPort
import br.com.bueno.grandesmestresmarciais.core.ports.out.FindAllModalityOutputPort
import br.com.bueno.grandesmestresmarciais.core.ports.out.FindModalityByIdOutputPort
import br.com.bueno.grandesmestresmarciais.core.ports.out.InsertModalityOutputPort

class InsertModalityUseCase(
    private val insertModalityOutputPort: InsertModalityOutputPort
): InsertModalityInputPort {
    override fun execute(modality: Modality) {
        insertModalityOutputPort.insert(modality)
    }
}

class DeleteModalityUseCase(
    private val deleteModalityOutputPort: DeleteModalityOutputPort
): DeleteModalityInputPort {
    override fun execute(modalityId: Int) {
        deleteModalityOutputPort.delete(modalityId)
    }
}

class FindAllModalityUseCase(
    private val findAllModalityOutputPort: FindAllModalityOutputPort
): FindAllModalityInputPort {
    override fun execute(): List<Modality> {
        return findAllModalityOutputPort.findAll()
    }
}

class FindModalityByIdUseCase(
    private val findModalityByIdOutputPort: FindModalityByIdOutputPort
): FindModalityByIdInputPort {
    override fun execute(modalityId: Int): Modality {
        return findModalityByIdOutputPort.find(modalityId)
    }

}