package com.manager;

import java.util.List;

import com.pojo.AuthorDetailsDto;
import com.pojo.ConferenceDetailsDto;
import com.pojo.ConferencePaperMappingClass;
import com.pojo.EventDetailsDto;
import com.pojo.EventParticipantMappingClass;
import com.pojo.EventUserMappingClass;
import com.pojo.EventVolunteerMappingClass;
import com.pojo.PaperAuthorMappingClass;
import com.pojo.PaperDetailsDto;

public interface EventManager {
	public void addEvent(EventDetailsDto detailsDto);
	public void addConference(ConferenceDetailsDto conference);
	public void addPaper(PaperDetailsDto paper);
	public void addAuthor(AuthorDetailsDto author);
	public void addUserToEvent(EventUserMappingClass eventUser);
	public void addVolunteerToEvent(EventVolunteerMappingClass eventVolunteer);
	public void addParticipantToEvent(EventParticipantMappingClass eventParticipant);
	public void addPaperToConference(ConferencePaperMappingClass conferencePaper);
	public void addAuthorToPaper(PaperAuthorMappingClass paperAuthor); 
	public EventDetailsDto getEvent(int eventId);
	public ConferenceDetailsDto getConference(int conferenceId);
	public List<AuthorDetailsDto> getAuthorsInConference(int conferenceId);
	public List<ConferenceDetailsDto> getAllConferences();
	public List<EventDetailsDto> getAllWorkshops();
	public List<EventDetailsDto> getAllGuestLectures();
	public List<EventDetailsDto> getAllCampusEvents();
	public List<EventDetailsDto> getAllEvents();
	public List<EventUserMappingClass> getEventsOfCoordinator(int userId);
	public void updateEvent(EventDetailsDto detailsDto);
	public void updateConference(ConferenceDetailsDto conference);
	public void deleteEvent(int eventId);
	public void deleteUserOfEvent(EventUserMappingClass eventUser);
	public void deleteVolunteerOfEvent(EventVolunteerMappingClass eventVolunteer);
	public void deleteParticipantOfEvent(EventParticipantMappingClass eventParticipant);
	public void deleteAllUsersOfEvent(int eventId);
	public void deleteAllConferences();
	public void deleteAllWorkshops();
	public void deleteAllGuestLectures();
	public void deleteAllParties();
	public void deleteAllEvents();
	public void deleteAllParticipantsOfEvent(int eventId);
	public void deleteAllVolunteersOfEvent(int eventId);
}
