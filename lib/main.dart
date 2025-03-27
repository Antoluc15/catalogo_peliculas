import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text("Welcome to Flutter"),
          centerTitle: true,
        ),
        body: Center(
          child: Text(
            "Hello World",
            style: TextStyle(fontSize: 24),
          ),
        ),
      ),
    );
  }
}
