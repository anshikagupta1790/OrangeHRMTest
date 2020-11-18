package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class DashboardPage extends BaseClass	 {
	
	
	@FindBy(xpath = "//*[contains(text(),'My Info')]")
	WebElement MyInfolink;
	
	@FindBy(xpath= "//*[@id=\'menu_training_defaultTrainingModulePage\']/a/span[2]")
	WebElement Traininglink;
	
	@FindBy(xpath="//*[@id=\'menu_training_viewCourseList\']/span[2]")
	WebElement Courseslink;
	
	@FindBy(xpath="//*[@id='menu_training_viewTrainerSessionList' and @href='/training/viewTrainerSessionList']/span[2]")
	WebElement TrainingSessionlink;
	
	@FindBy(xpath="//*[@id=\'menu_time_viewTimeModule\']/a/span[2]")
	WebElement Timelink;
	
	@FindBy(xpath="//*[@id=\'menu_time_Timesheets\']/a/span[2]")
	WebElement Timesheetslink;
	
	@FindBy(xpath="//*[@id=\'menu_time_viewMyTimesheet\']/span[2]")
	WebElement MyTimesheetslink;
	
	@FindBy(xpath="//*[@id=\'menu_time_viewTimesheetCsvExtract\']/span[2]")
	WebElement csvexportclick;
	
	@FindBy(xpath="//*[@id='menu_succession & development_Succession&Development' and @class='level1 succession_&_development no-padding parent']/a/span[2]")
	WebElement Successionlink;
	
	@FindBy(xpath="//*[@id='menu_succession & development_individualDevelopmentPlans' and @href='#/succession_and_development/idp_list']")
	WebElement Individualdeveloplink;
	
	@FindBy(xpath="//*[@id='menu_succession & development_myDevelopmentPlan']/span[2]")
	WebElement MyIDPlink;
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule' and @class= 'level1 recruitment no-padding parent']/a/span[2]")
	WebElement Recruitmentlink;
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewJobVacancy' and @href='/client/#/noncore/recruitment/viewJobVacancy']/span[2]")
	WebElement Vacancieslink;
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewCandidates' and @href='/recruitment/viewCandidates']/span[2]")
	WebElement Candidateslink;
	
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/a/span[2]")
	WebElement Adminlink;
	
	@FindBy(xpath="//*[@id='menu_admin_UserManagement' and @class='level2 no-padding parent']/a/span[2]")
	WebElement UserManagementlink;
	
	@FindBy(xpath="//*[@id='menu_admin_viewSystemUsers']")
	WebElement Userslink;
	
	@FindBy(xpath="//*[@id='menu_admin_Job']/a/span[2]")
	WebElement Joblink;
	
	@FindBy(xpath="//*[@id='menu_admin_viewSalaryComponentList']/span[2]")
	WebElement SalaryComponentslink;
	
	@FindBy(xpath="//*[@id='menu_admin_Competencies']/a/span[2]")
	WebElement Competencieslink;
	
	@FindBy(xpath="//*[@id='menu_admin_getEmployeeCompetencyList']/span[2]")
	WebElement Competencylistlink;
	
	@FindBy(xpath="//*[@id='menu_attendance_Attendance']/a/span[2]")
	WebElement Attendancelink;
	
	@FindBy(xpath="//*[@id='menu_attendance_viewMyAttendanceRecord']/span[2]")
	WebElement MyRecordslink;
	
	@FindBy(xpath="//*[@id='menu_attendance_punchIn' and @href='/client/#/route/attendance.my_punch_in_out']/span[2]")
	WebElement PunchInOutlink;
	
	@FindBy(xpath="//*[@id='menu_discipline_defaultDisciplinaryView']/a/span[2]")
	WebElement Disciplinelink;
	
	@FindBy(xpath="//*[@id='menu_discipline_viewDisciplinaryCases']/span[2]")
	WebElement DisciplinaryCaseslink;
	
	@FindBy(xpath="//*[@id='menu_discipline_viewMyActions' and @href='/discipline/viewMyActions']/span[2]")
	WebElement MyActionslink;
	
	@FindBy(xpath="//*[@id='menu_expense_viewExpenseModule']/a/span[2]")
	WebElement Expenselink;
	
	@FindBy(xpath="//*[@id='menu_expense_TravelRequests']/a/span[2]")
	WebElement TravelRequestslink;
	
	@FindBy(xpath="//*[@id='menu_expense_viewEmployeeEstimateRequest' and @href='/client/#/noncore/expense/viewEmployeeEstimateRequest']/span[2]")
	WebElement EmployeeTravelRequestslink;
	
	@FindBy(xpath="//*[@id='menu_expense_Claims']/a/span[2]")
	WebElement Claimslink;
	
	@FindBy(xpath="//*[@id='menu_expense_viewExpenseClaims'and @href='/expense/viewExpenseClaims']/span[2]")
	WebElement Employeeclaimslink;
	
	@FindBy(xpath="//*[@id=\'menu_leave_viewLeaveModule\']/a/span[2]")
	WebElement Leavelink;
	
	@FindBy(xpath="//*[@id='menu_leave_applyLeave']/span[2]")
	WebElement Applylink;
	
	@FindBy(xpath="//*[@id='menu_leave_viewMyLeaveList']")
	WebElement MyLeavelink;
	
	@FindBy(xpath="//*[@id='menu_leave_calendar']/span[2]")
	WebElement LeaveCalendarlink;
	
	@FindBy(xpath="//*[@id='menu_news_More']/a/span[2]")
	WebElement Morelink;
	
	@FindBy(xpath="//*[@id='menu_news_viewAnnouncementModule']/a/span[2]")
	WebElement Announcementslink;
	
	@FindBy(xpath="//*[@id='menu_news_viewDocumentArticle']/span[2]")
	WebElement Documentslink;
	
	@FindBy(xpath="//a[span='Assets']/span[@class='left-menu-title']")
	WebElement Assetslink;
	
	@FindBy(xpath="//*[@id='menu_asset_viewAssets']/span[2]")
	WebElement ViewAssetslink;
	
	@FindBy(xpath="//*[@id='menu_onboarding_defaultMenuView']/a/span[2]")
	WebElement Onboardinglink;
	
	@FindBy(xpath="//*[@id='menu_onboarding_viewTaskTypes' and @href='/client/#/noncore/onboarding/viewTaskTypes']/span[2]")
	WebElement Tasktypeslink;
	
	@FindBy(xpath="//*[@id='menu_onboarding_viewEmployeeTasks' and @href='/onboarding/viewEmployeeTasks/reset/1']/span[2]")
	WebElement employeetasks;
	
	@FindBy(xpath="//body/div/div/div/div/div/div/ul/li/div/ul/*[@id='menu_onboarding_Reports']/a/span[2]")
	WebElement reportslink;
	
	@FindBy(xpath="//*[@id='menu_onboarding_viewOnboardingReport']/span[2]")
	WebElement eventprogresslink;
	
	@FindBy(xpath="//*[@id='menu_time_Reports']/a/span[2]")
	WebElement reportslink_time;
	
	@FindBy(xpath="//*[@id='menu_time_displayProjectReportCriteria']/span[2]")
	WebElement projecttimelink;
	
	@FindBy(xpath="//*[@id='menu_time_displayMyAttendanceDetailsReport']/span[2]")
	WebElement mymonthlyattendencelink;
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
	WebElement PIM;
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
	WebElement employeeList;
	
	@FindBy(xpath="//*[@id=\"menu_pim_addEmployee\"]/span[2]")
	WebElement addEmployeeTab;
	
	@FindBy(xpath="//*[@id=\"addEmployeeModal\"]/h4")
	WebElement empAlert;
	
	@FindBy(xpath="//*[@id=\"pimAddEmployeeForm\"]/div[2]/a[2]")
	WebElement cancelAlert;
	
	@FindBy(xpath="//*[@id=\"menu__Performance\"]/a/span[2]")
	WebElement performanceTab;
	
	@FindBy(xpath="//*[@id=\"menu_performanceTracker_EmployeeTrackers\"]/a/span[2]")
	WebElement empTracker;
	
	@FindBy(xpath="//*[@id=\"menu_performanceTracker_viewEmployeePerformanceTrackerList\"]/span[2]")
	WebElement performTrackerList;
	
	@FindBy(xpath="//body/div/div/div/div/div/div/ul/li/div/ul/li[@id=\"menu_performance_Goals\"]/a/span[2]")
	WebElement goals;
	
	@FindBy(xpath="//*[@id=\"menu_performance_myGoals\"]/span[2]")
	WebElement mygoals;
	
	@FindBy(xpath="//*[@id=\"menu_performance_Appraisals\"]/a/span[2]")
	WebElement appraisalTab;
	
	@FindBy(xpath="//*[@id=\"menu_performance_viewAllAppraisals\"]/span[2]")
	WebElement appraisalsList;
	
	@FindBy(xpath="//*[@id=\"menu_expense_viewExpenseModule\"]/a/span[2]")
	WebElement expenseTab;
	
	@FindBy(xpath="//*[@id=\"menu_expense_TravelRequests\"]/a/span[2]")
	WebElement travelRequestTab;
	
	@FindBy(xpath="//*[@id=\"menu_time_ActivityInfo\"]/a/span[2]")
	WebElement activityinfo;
	
	@FindBy(xpath="//*[@id=\"menu_time_viewProjects\"]/span[2]")
	WebElement projects;
	
	@FindBy(xpath="//*[@id='menu_time_commonActivities' and @href='/client/#/route/time.common_activities']/span[2]")
	WebElement commonactivities;
	
	public DashboardPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateDashboardPageTitle() //actions
	{
		return driver.getTitle();
		
	}
	
	public MyInfoPage MyInfoclick()
	{
		MyInfolink.click();
		return new MyInfoPage();
		
	}
    public void TrainingTabclick()
    {
    	Traininglink.click();
	
     }
    public CourseListPage CoursesTabclick()
    {
    	Courseslink.click();
    	return new CourseListPage();
	
     }
    
    public TrainingSessionListPage TrainingSessionsTabclick()
    {
    	TrainingSessionlink.click();
    	return new TrainingSessionListPage();
	
     }
    public void Timeclick()
    {
    	Timelink.click();
    }
    public void Timesheetsclick()
    {
    	Timesheetslink.click();
    }
    
    
    public MyTimesheetsPage MyTimesheetsTabclick()
    {
    	MyTimesheetslink.click();
    	return new MyTimesheetsPage();
    }
    
   public ExportToCSVPage myTimeSheetExportCSVClick() {
	   
	   csvexportclick.click();
	   return new ExportToCSVPage();
	
   }
   
   public void successionAndDevelopClick()
   {
    Successionlink.click();
    
   }
   
   public IndividualDevelopmentPlansPage individualAndDevelopmentClick()
   {
	   Individualdeveloplink.click();
	   return new IndividualDevelopmentPlansPage();
   }
   
   
   public DevelopmentPlanPage myIDPClick()
   {
	   MyIDPlink.click();
	   return new DevelopmentPlanPage();
   }
   
   public void recruitmentClick()
   {
	   Recruitmentlink.click();
   }
   
   public VacanciesPage vacanciesClick()
   {
	   Vacancieslink.click();
	   return new VacanciesPage();
   }
   public CandidatesPage CandidatesClick()
   {
	   Candidateslink.click();
	   return new CandidatesPage();
   }
   
   public void adminClick()
   {
	   Adminlink.click();
   }
   
   public void userManagementClick()
   {
	   UserManagementlink.click();
   }
   
   public UsersPage usersClick()
   {
	   Userslink.click();
	   return new UsersPage();
   }
   
   public void jobClick()
   {
	  Joblink.click();
   }
   
   public SalaryComponentsPage salaryComponentsClick()
   {
	   SalaryComponentslink.click();
	   
	   return new SalaryComponentsPage();
   }
   
   public void CompetenciesClick()
   {
	   Competencieslink.click();
   }
   
   public String validateCompetencyListTab() //actions
	{
		return Competencylistlink.getText();
	}
   
   public void AttendanceClick()
   {
	   Attendancelink.click();
   }
   
   public MyRecordsPage MyRecordsClick()
   {
	   MyRecordslink.click();
	   return new MyRecordsPage();
   }
   
   public PunchInOutPage PunchInClick()
   {
	   PunchInOutlink.click();
	   return new PunchInOutPage();
   }
   
   public void DisciplineClick()
   {
	   Disciplinelink.click();
   }
   
   public DisciplinaryCasesPage DisciplinaryCasesClick()
   {
	   DisciplinaryCaseslink.click();
	   return new DisciplinaryCasesPage();
   }
   
   public ViewMyActionsPage MyactionsClick()
   {
	   MyActionslink.click();
	   return new ViewMyActionsPage();
   }
   public void ExpenseClick()
   {
	   Expenselink.click();
   }
   
   public void TravelRequestsClick()
   {
	   TravelRequestslink.click();
   }
   public TravelRequestsPage EmployeeTravelRequestsClick()
   {
	   EmployeeTravelRequestslink.click();
	   return new TravelRequestsPage();
   }
   public void ClaimsClick()
   {
	   Claimslink.click();
	   
   }
   public ExpenseClaimsPage employeeClaimsClick()
   {
	   Employeeclaimslink.click();
	   return new ExpenseClaimsPage();
   }
   
   public void leaveClick()
   {
	   Leavelink.click();
   }
   public ApplyLeavePage ApplyClick()
   {
	   Applylink.click();
	   return new ApplyLeavePage();
   }
   
   public MyLeaveListPage MyLeaveClick()
   {
	   MyLeavelink.click();
	   return new MyLeaveListPage();
   }
   
   public LeaveCalendarPage leaveCalendarPage() {
	   
	   LeaveCalendarlink.click();
	   return new LeaveCalendarPage();
	
   }
   
   public void moreClick()
   {
	   Morelink.click();
	   Morelink.click();
   }
   public void AnnouncementsClick()
   {
	   Announcementslink.click();
   }
   public PublishedDocumentsPage documentsClick()
   {
	   Documentslink.click();
	   return new PublishedDocumentsPage();
   }
   
   public void assestsClick() {
	   Assetslink.click();
	
}
   public AssestsPage viewAssestsClick() {
	   ViewAssetslink.click();
	   
	   return new AssestsPage();
	
}
   public void onboardingClick() {
	   Onboardinglink.click();
	
}
   
   public TasksTypePage taskTypesClick() {
	   Tasktypeslink.click();
	   return new TasksTypePage();
	
}
   
   public EmployeeTasksInformationPage employeeTasksClick() {
	   employeetasks.click();
	   return new EmployeeTasksInformationPage();
	
}
   public void reportsClick()
   {
	   reportslink.click();
   }
   public EventProgressReportPage eventProgressClick()
   {
	   eventprogresslink.click();
	   return new EventProgressReportPage();
   }
   
   public void reports_timeClick()
   {
	   reportslink_time.click();
   }
   public ProjectTimeReportPage project_timeClick()
   {
	   projecttimelink.click();
	   return new ProjectTimeReportPage();
   }
   public MyMonthlyAttendancePage my_MonthlyattendanceClick()
   {
	   mymonthlyattendencelink.click();
	   return new MyMonthlyAttendancePage();
   }
   
   
   public EmployeeListPage PIMClick() 
   {
	   PIM.click();
	   employeeList.click();
	   
	   return new EmployeeListPage();
   }
   
   public void addEmployeeTagClick() {
	   
	   addEmployeeTab.click();
	
   }
   
   public String switchAlert() {
	   String titleWindow=empAlert.getText();
	   cancelAlert.click();
	   return titleWindow;
	   
   }
   
   public void performanceTabClick() {
	   
	   performanceTab.click();
	
   }
   public PerformanceTrackerListPage empTrackerTabClick() {
	   
	   empTracker.click();
	   performTrackerList.click();
	   
	   return new PerformanceTrackerListPage();
	
   }
   
   public void goalsTabClick() {
	   
	   goals.click();
	
   }
   
   public MygoalsPage myGoalsTabClick() {
	   
	   mygoals.click();
	   return new MygoalsPage();
	   
   }
   
   public void appraisalTabClick() {
	   
	   appraisalTab.click();
	
   }

   public AppraisalListPage appraisalListClick() {
	   
	   appraisalsList.click();
	   return new AppraisalListPage();
	
   }
   
 public void activityInfoClick() {
	   
	   activityinfo.click();
	
   }
	
 public ProjectsPage projectsClick() {
	   
	   projects.click();
	   return new ProjectsPage();
	
 }
 public CommonActivitiesPage commonActivitiesClick() {
	   
	   commonactivities.click();
	   return new CommonActivitiesPage();
	
 }
}
    


