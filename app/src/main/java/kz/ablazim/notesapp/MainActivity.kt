package kz.ablazim.notesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kz.ablazim.notesapp.create_note.CreateNoteFragment
import kz.ablazim.notesapp.databinding.ActivityMainBinding
import kz.ablazim.notesapp.extensions.replaceFragment
import kz.ablazim.notesapp.note_list.NoteListFragment
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.i("onCreate called")

        // Step 1: Create 2 packages named as note_list and create_note
        // Step 2: In each package create empty fragments named as NoteListFragment and CreateNoteFragment
        // Step 3: Create empty viewModels named as NoteListViewModel and CreateNoteViewModel
        // Step 4: Create empty layouts for those 2 fragments
        // Step 5: Add navigation in MainActivity to NoteListFragment with the help of the replaceFragment extension
        //         that I have included in FragmentExtensions file

        replaceFragment(NoteListFragment())
    }
}