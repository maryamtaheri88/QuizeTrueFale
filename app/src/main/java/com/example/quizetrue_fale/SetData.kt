package com.example.quizetrue_fale

object SetData {
    var que: ArrayList<QuestionData> = arrayListOf()

    fun getQuestion():ArrayList<QuestionData>{

        var question1 = QuestionData(
            "1+2 = 2",
            1,
            "yes",
            "no",
            2
        )
        var question2 = QuestionData(
            "3+4=9?",
            2,
            "yes",
            "no",
            1
        )
        var question3 = QuestionData(
            "4/2=2",
            3,
            "yes",
            "no",
            1
        )
        var question4 = QuestionData(
            "5/3=3",
            4,
            "yes",
            "no",
            2
        )
        var question5 = QuestionData(
            "sheep can swim.",
            5,
            "yes",
            "no",
            2
        )
        var question6 = QuestionData(
            "bird cann`t fly.",
            6,
            "yes",
            "no",
            2
        )
        var question7 = QuestionData(
            "summer is cold.",
            7,
            "yes",
            "no",
            2
        )
        var question8 = QuestionData(
            "winter is cold?",
            8,
            "yes",
            "no",
            1
        )
        var question9 = QuestionData(
            "sea is green.",
            9,
            "yes",
            "no",
            2
        )
        var question10 = QuestionData(
            "sun is yellow.",
            10,
            "yes",
            "no",
            1
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)

        return que
    }

}