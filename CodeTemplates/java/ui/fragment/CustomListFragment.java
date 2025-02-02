/**
 * Created by Sim Sze Yu
 * GitHub: https://github.com/szeyu/Awsome-Android-Code-Template
 * 
 * This template is part of the WIA2007 Mobile Application Development Course
 * Bachelor of Computer Science (Artificial Intelligence)
 * Universiti Malaya
 * 
 * Licensed under MIT License
 * Copyright (c) 2025 Sim Sze Yu
 * 
 * ${FRAGMENT_NAME} Template.
 * Features:
 * - Displays a list of ${MODEL_NAME} items using RecyclerView, a ViewModel, and NavigationUtil.
 * - Offers options for different LayoutManagers.
 * - Handles item clicks to navigate to another fragment.
 * 
 * Usage:
 * 1. Replace placeholders with your specific names:
 *    - ${PACKAGE_NAME}: Your package name (e.g., com.multimediajournalapp.peoplemory.ui.fragments)
 *    - ${FRAGMENT_NAME}: The name of this fragment (e.g., PeopleListFragment)
 *    - ${MODEL_NAME}: Your model class name (e.g., Person)
 *    - ${ADAPTER_NAME}: Your adapter class name (e.g., PersonAdapter)
 *    - ${VIEW_MODEL_CLASS}: Your ViewModel class name (e.g., PersonViewModel)
 *    - ${LAYOUT_RESOURCE}: The layout resource (e.g., R.layout.fragment_people_list)
 *    - ${RECYCLER_VIEW_ID}: The RecyclerView id (e.g., R.id.recycler_view_people)
 *    - ${NAVIGATION_UTIL}: Your navigation utility class (e.g., NavigationUtil)
 *    - ${NAVIGATION_ACTION_ID}: Navigation action id (e.g., R.id.action_peopleListFragment_to_editPersonFragment)
 *    - ${ITEM_ID_KEY}: The key for the item's id in the bundle (e.g., "personId")
 *    - ${MODEL_ID_METHOD}: The method to get the id from the model (e.g., getId)
 * 2. Uncomment the LayoutManager option that you want.
 */

 package ${PACKAGE_NAME};

 import android.os.Bundle;
 
 import androidx.annotation.NonNull;
 import androidx.annotation.Nullable;
 import androidx.fragment.app.Fragment;
 import androidx.lifecycle.ViewModelProvider;
 import androidx.recyclerview.widget.GridLayoutManager;
 import androidx.recyclerview.widget.LinearLayoutManager;
 import androidx.recyclerview.widget.RecyclerView;
 import androidx.recyclerview.widget.StaggeredGridLayoutManager;
 
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;
 
 import ${PACKAGE_NAME}.R;
 import ${PACKAGE_NAME}.model.${MODEL_NAME};
 import ${PACKAGE_NAME}.ui.adapter.${ADAPTER_NAME};
 import ${PACKAGE_NAME}.ui.navigation.${NAVIGATION_UTIL};
 import ${PACKAGE_NAME}.ui.viewModel.${VIEW_MODEL_CLASS};
 
 import java.util.List;
 
 public class ${FRAGMENT_NAME} extends Fragment {
 
     private ${VIEW_MODEL_CLASS} viewModel;
     private ${ADAPTER_NAME} adapter;
 
     public ${FRAGMENT_NAME}() {
         // Required empty public constructor
     }
 
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         // Inflate the layout for this fragment
         return inflater.inflate(${LAYOUT_RESOURCE}, container, false);
     }
 
     @Override
     public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
         if (view == null) {
             throw new NullPointerException("Fragment view is null, check " + ${LAYOUT_RESOURCE} + " layout.");
         }
 
         RecyclerView recyclerView = view.findViewById(${RECYCLER_VIEW_ID});
         if (recyclerView == null) {
             throw new NullPointerException("RecyclerView with ID " + ${RECYCLER_VIEW_ID} + " not found in the inflated layout");
         }
 
         // Set LayoutManager (Required)
         // Uncomment one of the options below:
 
         // For a default vertical list:
         // recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
 
         // For a grid layout with 2 columns:
         // recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
 
         // For a staggered grid layout with 2 columns:
         recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
 
         // Initialize adapter, set item click listener, and assign adapter to RecyclerView
         adapter = new ${ADAPTER_NAME}();
         adapter.setOnItemClickListener(item -> {
             // Create a bundle to pass the selected ${MODEL_NAME}'s ID
             Bundle args = new Bundle();
             args.putInt("${ITEM_ID_KEY}", item.getId());
             ${NAVIGATION_UTIL}.navigateTo(${FRAGMENT_NAME}.this, ${NAVIGATION_ACTION_ID}, args);
         });
         recyclerView.setAdapter(adapter);
 
         // Initialize ViewModel
         viewModel = new ViewModelProvider(this).get(${VIEW_MODEL_CLASS}.class);
 
         // Observe the LiveData and update RecyclerView when data changes
         viewModel.getAllItems().observe(getViewLifecycleOwner(), (List<${MODEL_NAME}> ${MODEL_NAME_LOWER}) -> {
             adapter.setItemList(${MODEL_NAME_LOWER});
         });
     }
 }
 