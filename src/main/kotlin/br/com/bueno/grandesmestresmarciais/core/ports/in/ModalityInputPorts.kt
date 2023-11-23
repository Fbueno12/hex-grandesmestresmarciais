package br.com.bueno.grandesmestresmarciais.core.ports.`in`

import br.com.bueno.grandesmestresmarciais.core.domain.Modality

interface InsertModalityInputPort {
    fun execute(modality: Modality)
}

interface DeleteModalityInputPort {
    fun execute(modalityId: Int)
}

interface FindAllModalityInputPort {
    fun execute(): List<Modality>
}

interface FindModalityByIdInputPort {
    fun execute(modalityId: Int): Modality
}