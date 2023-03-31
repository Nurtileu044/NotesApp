package kz.ablazim.notesapp.create_note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kz.ablazim.notesapp.R
import kz.ablazim.notesapp.databinding.FragmentCreateNoteBinding
import kz.ablazim.notesapp.extensions.replaceFragment
import kz.ablazim.notesapp.note_list.NoteListFragment

class CreateNoteFragment : Fragment(R.layout.fragment_create_note) {

    private lateinit var binding: FragmentCreateNoteBinding
    private val viewModel: CreateNoteViewModel by viewModels()
}