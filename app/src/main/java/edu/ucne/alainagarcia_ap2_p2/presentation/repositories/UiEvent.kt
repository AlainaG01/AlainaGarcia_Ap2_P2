package edu.ucne.alainagarcia_ap2_p2.presentation.repositories

sealed class UiEvent {
    object NavigateUp : UiEvent()
    data class ShowSnackbar(val message: String) : UiEvent()
}