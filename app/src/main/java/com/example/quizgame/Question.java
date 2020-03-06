package com.example.quizgame;

public class Question {

    public String questions[] = {
            "Which is a Programming Language?",
            "In COMAL language program, after name of procedure parameters must be in?",
            "Programming language COBOL works best for use in?",
            "The language spoken by the people by Pakistan is ?",
            "Country that has the highest in Barley Production ?",
            "The metal whose salts are sensitive to light is ?",
            "The Central Rice Research Station is situated in ?",
            "The World Largest desert is ?",
            "What is the Color of Apple?",
            "What is the Capital of Bangladesh?"
    };

    public String choices[][] = {
            {"HTML", "CSS", "Vala", "PHP"},
            {"Punction Marks", "Back-Slash", "Brackets", "Semi Colon"},
            {"Siemens Applications", "Student Applications", "Social Applications", "Commercial Applications"},
            { "Hindi", "Palauan", "Sindhi" ,"Nauruan"},
            {"China", "India", "Russia","France"},
            {"Zinc", "Silver", "Copper","Aluminium"},
            {"Chennai","Cuttack", "Bangalore" ,"Quilon"},
            {"Thar","Kalahari","Sahara","Sonoran "},
            {"Green","Red","Yallow","Black"},
            {"Sylhet","London","Dhaka","Comilla"}
    };

    public String correctAnswer[] = {
            "PHP",
            "Brackets",
            "Commercial Applications",
            "Sindhi",
            "Russia",
            "Silver",
            "Cuttack",
            "Sahara",
            "Red",
            "Dhaka"

    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
