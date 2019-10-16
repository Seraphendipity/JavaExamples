# Student Grade System
Takes in file [input.csv](resources/input.csv) in the resources folder as a comma-seperated list of `first_name,last_name,test_grade_1,test_grade_2,exam_grade,`. Different students are seperated by a newline. Outputs the letter grade and numerical grade in `first_name last_name: numerical_grade -> letter_grade` format on both the command line and [output.txt](resources/output.txt) (also seperated by newlines between students).

## TODO
- [ ] BUG: Lines require a comma at end of the line, instead of simply EoL character
- [ ] BUG: Currently using additional weights and grades (more than three) is only half-implemented and not fully supported. 
- [ ] ADD: Random generation of students for testing.