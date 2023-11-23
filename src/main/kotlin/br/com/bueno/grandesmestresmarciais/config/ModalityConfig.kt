package br.com.bueno.grandesmestresmarciais.config

import br.com.bueno.grandesmestresmarciais.adapters.out.DeleteModalityAdapter
import br.com.bueno.grandesmestresmarciais.adapters.out.FindAllModalityAdapter
import br.com.bueno.grandesmestresmarciais.adapters.out.FindModalityByidAdapter
import br.com.bueno.grandesmestresmarciais.adapters.out.InsertModalityAdapter
import br.com.bueno.grandesmestresmarciais.core.usecase.DeleteModalityUseCase
import br.com.bueno.grandesmestresmarciais.core.usecase.FindAllModalityUseCase
import br.com.bueno.grandesmestresmarciais.core.usecase.FindModalityByIdUseCase
import br.com.bueno.grandesmestresmarciais.core.usecase.InsertModalityUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ModalityConfig {
    @Bean
    fun insertModalityUseCase(
        insertModalityAdapter: InsertModalityAdapter
    ): InsertModalityUseCase {
        return InsertModalityUseCase(insertModalityAdapter)
    }

    @Bean
    fun deleteModalityUseCase(
        deleteModalityAdapter: DeleteModalityAdapter
    ): DeleteModalityUseCase {
        return DeleteModalityUseCase(deleteModalityAdapter)
    }

    @Bean
    fun findAllModalityUseCase(
        findAllModalityAdapter: FindAllModalityAdapter
    ): FindAllModalityUseCase {
        return FindAllModalityUseCase(findAllModalityAdapter)
    }

    @Bean
    fun findModalityByIdUseCase(
        findModalityByidAdapter: FindModalityByidAdapter
    ): FindModalityByIdUseCase {
        return FindModalityByIdUseCase(findModalityByidAdapter)
    }
}