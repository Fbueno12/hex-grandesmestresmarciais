package br.com.bueno.grandesmestresmarciais.adapters.out.repository

import br.com.bueno.grandesmestresmarciais.adapters.out.entity.ModalityEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ModalityRepository: JpaRepository<ModalityEntity, Int>