package kz.ablazim.notesapp.note_list

import androidx.lifecycle.ViewModel

class NoteListViewModel : ViewModel() {

    var todoList = mutableListOf(
        NoteModel("task 1 ", "create a fragment"),
        NoteModel("task 2", "create a fragment ViewModel"),
        NoteModel("task 3", "create a layout file"),
        NoteModel("task 4", "create a adapter"),
        NoteModel("task 5", "create a recyclerView"),
        NoteModel("task 6", "create a recyclerView"),
        NoteModel("task 7", "create a recyclerView and check is the long line converted to three dots"),
        NoteModel("task 8", "create a recyclerView"),
        NoteModel("task 9", "create a recyclerView"),
        NoteModel("task 10", "create a recyclerView"),
        NoteModel("task 11", "create a recyclerView"),
        NoteModel("task 12", "create a recyclerView"),
        NoteModel("task 13", "create a recyclerView"),
    )
}