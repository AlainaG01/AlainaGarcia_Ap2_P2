package edu.ucne.alainagarcia_ap2_p2.presentation.repositories

import edu.ucne.alainagarcia_ap2_p2.data.remote.dto.RepositoryDto

data class RepositoryUiState (
    val name: String = "",
    val descripcion: String = "",
    val html_url: String = "",
    val isLoading: Boolean = false,
    val repository: List<RepositoryDto> = emptyList(),
    val errorMessage: String? = null,
)