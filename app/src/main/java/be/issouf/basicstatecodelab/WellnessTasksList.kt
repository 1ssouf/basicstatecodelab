package be.issouf.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items

private fun getWellnessTasks() = List(30) {i -> WellnessTask(i, "Tâche $i")}

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTasks() }
){
    LazyColumn(
        modifier = modifier
    ) {
        items(list){ task ->
            WellnessTaskItem(taskName = task.label)
        }
    }

}