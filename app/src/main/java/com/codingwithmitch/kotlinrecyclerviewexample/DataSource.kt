package com.codingwithmitch.kotlinrecyclerviewexample

import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\digital_ocean.png",
                    "Sally"
                )
            )
            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\time_to_build_a_kotlin_app.png",
                    "mitch"
                )
            )

            list.add(
                BlogPost(
                    "Interviewing a Web Developer and YouTuber",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\coding_for_entrepreneurs.png",
                    "John"
                )
            )
            list.add(
                BlogPost(
                    "Engineered Truth - Matt Tran",
                    "Matt has been a full-time YouTuber for 7 years now. He's the creator of the YouTube channel \\\"Engineered Truth\\\". But these days, that's not all he does.\\r\\n\\r\\nMatt and I talk about:\\r\\n\\r\\nHis life as an Entrepreneur and YouTuber\\r\\nHis experiences becoming a YouTuber and how it all got started\\r\\nSome of his \\\"big breaks\\\" in terms of developing his content-creating skills\\r\\nPersonal business experiences\\r\\nHis other business ventures",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawabl\\engineered_truth_matt_tran.png",
                    "Mohammed"
                )
            )
            list.add(
                BlogPost(
                    "Freelance Android Developer (Vasiliy Zukanov)",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\freelance_android_dev_vasiliy_zukanov.png",
                    "Steven"
                )
            )
            list.add(
                BlogPost(
                    "Freelance Android Developer, Donn Felker",
                    "Freelancing as an Android developer with Donn Felker.\\r\\n\\r\\nDonn is also:\\r\\n\\r\\n1) Founder of caster.io\\r\\n\\r\\n2) Co-host of the fragmented podcast (fragmentedpodcast.com).",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\freelance_android_dev_donn_felker.png",
                    "Richelle"
                )
            )
            list.add(
                BlogPost(
                    "Work Life Balance for Software Developers",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\work_life_balance.png",
                    "Jessica"
                )
            )
            list.add(
                BlogPost(
                    "Full Stack Web Developer - Nicholas Olsen",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\fullsnack_developer.png",
                    "Guy"
                )
            )
            list.add(
                BlogPost(
                    "Javascript Expert - Wes Bos",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\javascript_expert_wes_bos.png",
                    "Ruby"
                )
            )
            list.add(
                BlogPost(
                    "Senior Android Engineer - Kaushik Gopal",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "D:\\Android Studio Projects\\KotlinRecyclerViewExample\\app\\src\\main\\res\\drawable\\senior_android_engineer_kaushik_gopal.png",
                    "mitch"
                )
            )
            return list
        }
    }
}