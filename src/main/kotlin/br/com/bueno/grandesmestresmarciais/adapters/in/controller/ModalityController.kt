package br.com.bueno.grandesmestresmarciais.adapters.`in`.controller

import br.com.bueno.grandesmestresmarciais.adapters.`in`.dto.DefaultResponseDTO
import br.com.bueno.grandesmestresmarciais.adapters.`in`.dto.ModalityDTO
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.DeleteModalityInputPort
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.FindAllModalityInputPort
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.FindModalityByIdInputPort
import br.com.bueno.grandesmestresmarciais.core.ports.`in`.InsertModalityInputPort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/modality")
class ModalityController (
    private val insertModalityInputPort: InsertModalityInputPort,
    private val deleteModalityInputPort: DeleteModalityInputPort,
    private val findAllModalityInputPort: FindAllModalityInputPort,
    private val findModalityByIdInputPort: FindModalityByIdInputPort
) {

    @PostMapping
    fun insertModality(@RequestBody modality: ModalityDTO): ResponseEntity<Void> {
        val result = insertModalityInputPort.execute(modality.toDomain())
        return ResponseEntity.status(201).build()
    }

    @DeleteMapping("/{modalityId}")
    fun deleteModality(@PathVariable modalityId: Int): ResponseEntity<Void> {
        val result = deleteModalityInputPort.execute(modalityId)
        return ResponseEntity.status(204).build()
    }

    @GetMapping
    fun findAllModality(): ResponseEntity<DefaultResponseDTO<List<ModalityDTO>>> {
        val result = findAllModalityInputPort.execute().map {
            ModalityDTO().fromDomain(it)
        }
        return ResponseEntity.ok().body(DefaultResponseDTO(result))
    }

    @GetMapping("/{modalityId}")
    fun findModalityById(@PathVariable modalityId: Int): ResponseEntity<DefaultResponseDTO<ModalityDTO>> {
        val result = findModalityByIdInputPort.execute(modalityId)
        return ResponseEntity.ok().body(DefaultResponseDTO(ModalityDTO().fromDomain(result)))
    }

}