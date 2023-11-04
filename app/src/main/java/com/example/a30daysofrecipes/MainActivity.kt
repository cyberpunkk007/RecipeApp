package com.example.a30daysofrecipes

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysofrecipes.data.Datasource
import com.example.a30daysofrecipes.model.Dish
import com.example.a30daysofrecipes.ui.theme._30DaysOfRecipesTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfRecipesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RecipeApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeApp(){
    Scaffold(
        topBar = {
            RecipeTopBar()
        }
    ){
        LazyColumn(contentPadding = it){
            items(Datasource().loadRecipes()) { dish ->
                RecipeCard(
                    dish = dish,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

//@Composable
//fun RecipeList(
//    recipeList: List<Dish>,
//    modifier: Modifier=Modifier
//){
//    LazyColumn(modifier=modifier){
//        items(recipeList){dish->
//            RecipeCard(
//                dish=dish,
//                modifier=Modifier.padding(8.dp)
//            )
//        }
//    }
//}

@Composable
private fun RecipeItemButton(
    expanded:Boolean,
    onClick: () -> Unit,
    modifier:Modifier=Modifier
) {
    IconButton(
        onClick = onClick,
        modifier=modifier
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
            contentDescription = null
        )
}
}

@Composable
fun RecipeCard(
    dish: Dish,
    modifier: Modifier=Modifier
){
    var expanded by remember{mutableStateOf(false) }
    Card(modifier=modifier) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = stringResource(dish.stringResourceId1),
                //style=MaterialTheme.typography.h3
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = LocalContext.current.getString(dish.stringResourceId2),
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Image(
                painter = painterResource(id =dish.imageResourceId),
                contentDescription = null,
                modifier= Modifier
                    .fillMaxWidth()
                    .height(190.dp),
                contentScale= ContentScale.Crop
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Text(
                    text= "Recipe"
                )
                Spacer(modifier = Modifier.padding(10.dp))
                RecipeItemButton(
                    expanded = expanded,
                    onClick = {expanded=!expanded},
                )
            }
            if(expanded){
                Text(
                    text= stringResource(dish.stringResourceId3),
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeTopBar(modifier:Modifier=Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
//                Image(
//                    modifier= Modifier
//                        .size(dimensionResource(id = R.dimen.image_size))
//                        .padding(dimensionResource(id = R.dimen.padding_small)),
//                    painter = painterResource(id = R.drawable.),
//                    contentDescription = null
//                )
                Text(
                    text="The Monthly Cookbook",
                    style=MaterialTheme.typography.labelLarge
                )
            }
        },
        modifier=modifier
    )
}

@Preview(showBackground = true)
@Composable
fun RecipeAppPreview() {
    _30DaysOfRecipesTheme {
        RecipeApp()
    }
}