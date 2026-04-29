package ec.edu.uisek.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ec.edu.uisek.githubclient.ui.components.RepoItem
import ec.edu.uisek.githubclient.ui.theme.GithubClientTheme

@Composable
fun RepoList () {
    Column (
        modifier = Modifier
            .padding( 40.dp, 16.dp, 16.dp, 16.dp )
    ) {
        RepoItem(
            "Repositorio en Android",
            "Este es un repositorio construido en Kotlin con Jetpack Compose",
            "Kotlin",
            "https://avatars.githubusercontent.com/u/215519037?v=4"
        )
        RepoItem(
            "Repositorio en Android",
            "Este es un repositorio construido en Kotlin con Jetpack Compose",
            "Swift",
            "https://avatars.githubusercontent.com/u/215519037?v=4"
        )
        RepoItem(
            "Repositorio en Android",
            "Este es un repositorio construido en Kotlin con Jetpack Compose",
            "Python",
            "https://avatars.githubusercontent.com/u/215519037?v=4"
        )
        RepoItem(
            "Repositorio en Android",
            "Este es un repositorio construido en Kotlin con Jetpack Compose",
            "React",
            "https://avatars.githubusercontent.com/u/215519037?v=4"
        )

    }
}

@Preview(showBackground = true)

@Composable
fun RepoItemPreview () {
    GithubClientTheme {
        RepoList()
    }
}