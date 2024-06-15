package com.example.theemailapp.database

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.theemailapp.model.Email

class EmailDao {

    data class Email(
        val id: Int,
        val sender: String,
        val recipient: String,
        val title: String,
        val body: String
    )

    fun generateMockEmails(): List<Email> {
        return listOf(
            Email(
                id = 1,
                sender = "alice@example.com",
                recipient = "bob@example.com",
                title = "Meeting Reminder",
                body = "Just a reminder that we have a meeting tomorrow at 10 AM."
            ),
            Email(
                id = 2,
                sender = "charlie@example.com",
                recipient = "dave@example.com",
                title = "Project Update",
                body = "The latest updates on the project are as follows..."
            ),
            Email(
                id = 3,
                sender = "eve@example.com",
                recipient = "frank@example.com",
                title = "Lunch Plans",
                body = "Are we still on for lunch today at 1 PM?"
            ),
            Email(
                id = 4,
                sender = "grace@example.com",
                recipient = "heidi@example.com",
                title = "Vacation Request",
                body = "I would like to request vacation time from July 1 to July 15."
            ),
            Email(
                id = 5,
                sender = "ivan@example.com",
                recipient = "judy@example.com",
                title = "Team Building Event",
                body = "We are planning a team building event next Friday. Are you available?"
            )
        )
    }

}