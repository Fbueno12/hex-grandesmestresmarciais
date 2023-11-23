package br.com.bueno.grandesmestresmarciais.core.ports.out

import br.com.bueno.grandesmestresmarciais.core.domain.Modality

interface InsertModalityOutputPort {
    fun insert(modality: Modality)
}

interface DeleteModalityOutputPort {
    fun delete(modalityId: Int)
}

interface FindAllModalityOutputPort {
    fun findAll(): List<Modality>
}

interface FindModalityByIdOutputPort {
    fun find(modalityId: Int): Modality
}