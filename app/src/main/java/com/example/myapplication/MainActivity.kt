package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.nio.file.WatchEvent


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TabRowExampleScreen()

                }
            }
        }
    }
}

@Composable
fun TabRowExampleScreen() {

    val tabs = listOf("Family", "Friends", "Other Chats", "Work", "Education")

    TabRowComponent(
        tabs = tabs,
        contentScreens = listOf(
            { ScaffoldElement(listOfElements = folder(1))},
            { ScaffoldElement(listOfElements = folder(2))},
            { ScaffoldElement(listOfElements = folder(3))}
        ),
        modifier = Modifier. fillMaxSize(),

    )
}

fun folder(selection: Int): MutableList<TabClass> {
    val listOfFamilyElements = mutableStateListOf(
        TabClass(
            R.drawable.baseline_favorite_24,
            "Father",
            "",
            "Let's order some pizzzza",
            "Oct 05",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Mom",
            "",
            "Don't order anything!!",
            "Oct 05",
            true
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 04",
            true
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 04",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Father",
            "",
            "Let's order some pizzzza",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Mom",
            "",
            "Don't order anything!!",
            "Oct 03",
            true
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 03",
            true
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Father",
            "",
            "Let's order some pizzzza",
            "Oct 02",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Mom",
            "",
            "Don't order anything!!",
            "Oct 02",
            true
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 02",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 01",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Father",
            "",
            "Let's order some pizzzza",
            "Oct 01",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Mom",
            "",
            "Don't order anything!!",
            "Oct 01",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 03",
            false
        )
    )

    val listOfFriendsElements = mutableStateListOf(
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nick",
            "",
            "I want to play minecraft with you",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Алиса",
            "",
            "Ты че? Америкосом стал?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Jack",
            "",
            "CHe za tyagi le?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nicolya",
            "",
            "Take some sugar tonight",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nick",
            "",
            "I want to play minecraft with you",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Алиса",
            "",
            "Ты че? Америкосом стал?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Jack",
            "",
            "CHe za tyagi le?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nicolya",
            "",
            "Take some sugar tonight",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nick",
            "",
            "I want to play minecraft with you",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Алиса",
            "",
            "Ты че? Америкосом стал?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Jack",
            "",
            "CHe za tyagi le?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nicolya",
            "",
            "Take some sugar tonight",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nick",
            "",
            "I want to play minecraft with you",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Алиса",
            "",
            "Ты че? Америкосом стал?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Jack",
            "",
            "CHe za tyagi le?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nicolya",
            "",
            "Take some sugar tonight",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nick",
            "",
            "I want to play minecraft with you",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Алиса",
            "",
            "Ты че? Америкосом стал?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Jack",
            "",
            "CHe za tyagi le?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nicolya",
            "",
            "Take some sugar tonight",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nick",
            "",
            "I want to play minecraft with you",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Алиса",
            "",
            "Ты че? Америкосом стал?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Jack",
            "",
            "CHe za tyagi le?",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Nicolya",
            "",
            "Take some sugar tonight",
            "Oct 03",
            false
        )
    )

    val listOfOtherChatsElements = mutableStateListOf(
        TabClass(
            R.drawable.baseline_favorite_24,
            "Superheroes",
            "Batman: ",
            "The city needs a new hero.",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "MGMA(Make Android Great Again",
            "Jack Anderson: ",
            "Салам Алейкум",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Superheroes",
            "Batman: ",
            "The city needs a new hero.",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "MGMA(Make Android Great Again",
            "Jack Anderson: ",
            "Салам Алейкум",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Superheroes",
            "Batman: ",
            "The city needs a new hero.",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "MGMA(Make Android Great Again",
            "Jack Anderson: ",
            "Салам Алейкум",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Superheroes",
            "Batman: ",
            "The city needs a new hero.",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "MGMA(Make Android Great Again",
            "Jack Anderson: ",
            "Салам Алейкум",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Superheroes",
            "Batman: ",
            "The city needs a new hero.",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "MGMA(Make Android Great Again",
            "Jack Anderson: ",
            "Салам Алейкум",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Some",
            "",
            "Cheto tam jies",
            "Oct 03",
            false
        ),
        TabClass(
            R.drawable.baseline_favorite_24,
            "Kama Pulya",
            "",
            "Esly ti dermo ne brosish, to dermo teb...",
            "Oct 03",
            false
        )
    )


    when(selection){
        1 -> return listOfFamilyElements
        2 -> return listOfFriendsElements
        3 -> return listOfOtherChatsElements
    }
    return listOfFamilyElements
}

@Composable
fun TabRowComponent(
    tabs: List<String>,
    contentScreens: List<@Composable () -> Unit>,
    modifier: Modifier = Modifier,
){
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }


    Column(
        Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        ScrollableTabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.DarkGray,
            contentColor = Color.White,
            indicator = {
                tabPositions -> TabRowDefaults.Indicator(
                    modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                    color = Color.Red
                )
            },
            ) {
            tabs.forEachIndexed{ index, tabTitle ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    modifier = Modifier.padding(all = 16.dp)) {
                    Text(text = tabTitle)
                }

            }
        }
        contentScreens.getOrNull(selectedTabIndex)?.invoke()
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScaffoldElement(listOfElements: List<TabClass>){
    Column{
        LazyColumn(){
            items(listOfElements){
                    listOfElements -> TabItem(tabItem = listOfElements)
            }
        }
    }


}

@Composable
fun TabItem(
    tabItem: TabClass
){

    Column(
        Modifier
            .background(Color.DarkGray)
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = "https://pixabay.com/static/frontend/f3bf2f2276994a4cc1c8.png",
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .border(0.5.dp, Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Column {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row {
                        Text(
                            text = tabItem.title,
                            color = Color.White
                        )
                        if (tabItem.muteIcon){
                            Icon(
                                painter = painterResource(id = R.drawable.outline_edit_notifications_24),
                                contentDescription = null,
                                tint = Color.Gray,
                                modifier = Modifier.size(20.dp))
                        }

                    }

                    Text(
                        text = tabItem.date,
                        color = Color.Gray,
                        modifier = Modifier.align(Alignment.TopEnd)
                    )
                }

                Row {
                    Text(
                        text = tabItem.name,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = tabItem.message,
                        color = Color.Gray
                    )
                }
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScaffoldPreview() {
    MyApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {

            TabRowExampleScreen()

        }
    }
}