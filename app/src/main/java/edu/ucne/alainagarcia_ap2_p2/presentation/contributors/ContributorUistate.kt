package edu.ucne.alainagarcia_ap2_p2.presentation.contributors

import edu.ucne.alainagarcia_ap2_p2.data.remote.dto.ContributorDto

data class ContributorUistate(
    val login: String = "",
    val id: Int = 0,
    val contribution: Int = 0,
    val isLoading: Boolean = false,
    val contributor: List<ContributorDto> = emptyList(),
    val errorMessage: String? = null,
)