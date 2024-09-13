public class FlowControl {
    public String getResult(Integer[] grades){
        Integer total = 0;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        Integer medium = total / grades.length;

        if(medium >= 7){
            return "Approved";
        }else if(medium >=5){
            return "Retake Exam";
        }else{
            return "Failed";
        }

    }
}